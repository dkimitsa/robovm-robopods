# RoboPods for Pollfish

## Official website
https://www.pollfish.com/docs/ios

## Available RoboPods
| RoboPods Version | Pollfish Version |
|------------------|------------------|
| 1.35.0           | 6.5.0            |
| 1.31.0           | 6.4.1            |
| 1.28.0           | 6.3.1            |
| 1.23.0           | 6.2.5            |
| 1.21.0           | 6.2.4            |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `pollfish.framework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where pollfish.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-pollfish-ios:$altpodsVersion"
}
```

## Sample code
```java
UserAttributesDictionary userAttributesDictionary = new UserAttributesDictionary();
userAttributesDictionary
        .setGender(Gender.MALE)
        .setRace(Race.WHITE)
        .setYearOfBirth(YearOfBirth._1984)
        .setMaritalStatus(MaritalStatus.MARRIED)
        .setParentalStatus(ParentalStatus.THREE)
        .setEducation(EducationLevel.UNIVERSITY)
        .setEmployment(EmploymentStatus.EMPLOYED_FOR_WAGES)
        .setCareer(Career.TELECOMMUNICATIONS)
        .setIncome(Income.MIDDLE_I);

PollfishParams pollfishParams = new PollfishParams(new VoidBlock1<PollfishParams>() {
    @Override
    public void invoke(PollfishParams pollfishParams) {
        pollfishParams.setIndicatorPosition(PollfishPosition.MiddleRight);
        pollfishParams.setIndicatorPadding(10);
        pollfishParams.setReleaseMode(false);
        pollfishParams.setOfferwallMode(false);
        pollfishParams.setRequestUUID("USER_ID");
        pollfishParams.setUserAttributes(userAttributesDictionary);
    }
});

Pollfish.init("YOUR_API_KEY", pollfishParams);
```
