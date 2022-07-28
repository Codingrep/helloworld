package ca.sunlife.web.apps.web_apps_helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * Utility class to store build version information.
 *
 */
public final class BuildVersion {

    /**
     * Used to store build version.
     */
    public static final String VERSION;

    /**
     * Date the application last started.
     */
    public static final Date STARTED_ON = new Date();

    /**
     * Git branch the current build was created from.
     */
    public static final String GIT_BRANCH;

    /**
     * Git commit the current build was created from.
     */
    public static final String GIT_COMMIT;

    /**
     * Utility class, constructor should not be called.
     */
    private BuildVersion() {
        // not called
    }

    /**
     * Reads build properties file from same package as this class.
     * Sets VERSION using build time Maven properties.
     */
    static {
    	String version = "VERSION UNINITIALIZED - " + BuildVersion.class.getPackage().getName();
    	String branch = "";
    	String releaseBranch = "";
    	String commit = "";
        InputStream in = null;

        try {
            Properties prop = new Properties();
            in = BuildVersion.class.getResourceAsStream("build.properties");
            prop.load(in);
            version = String.format("%s: %s_%s",
                    prop.getProperty("application.name"),
                    prop.getProperty("application.version"),
                    prop.getProperty("build.timestamp"));
            commit = prop.getProperty("git.commit");            	
            releaseBranch = prop.getProperty("git.release.branch");
            if (releaseBranch == null || releaseBranch.contains("$")) {
            	branch = prop.getProperty("git.branch");
            } else {
            	branch = releaseBranch;
            }
        } catch (IOException e) {
            // do nothing
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                // do nothing
            }
        }
        VERSION = version;
        GIT_BRANCH = branch;
        GIT_COMMIT = commit;
        
    }

}
