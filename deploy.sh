#!/bin/bash

 mvn -X -B -ntp -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=info \
 	deploy \
	-DaltReleaseDeploymentRepository=libs-release-local \
	-DaltSnapshotDeploymentRepository=libs-snapshot-local
