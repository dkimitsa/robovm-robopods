# Release workflow 

- change version from snapshot to release:
  > mvn versions:set -DnewVersion=1.54.0
  > mvn versions:commit

- do a clean build 
  > mvn clean install -T 10

- deploy to Sonatype staging (using `central-publishing-maven-plugin` as part of `ossrh-release` profile)
  > mvn deploy -Possrh-release

- publish to MavenCentral at [sonatype portal](https://central.sonatype.com/publishing) 

- merge to `alt` branch

- create [a release page](https://github.com/dkimitsa/robovm-robopods/releases/new) 