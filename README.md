# MyBatis Type Handlers for ThreeTen-Extra

[![Java CI](https://github.com/mybatis/typehandlers-threeten-extra/actions/workflows/ci.yaml/badge.svg)](https://github.com/mybatis/typehandlers-threeten-extra/actions/workflows/ci.yaml)
[![Coverage Status](https://coveralls.io/repos/github/mybatis/typehandlers-threeten-extra/badge.svg?branch=master)](https://coveralls.io/github/mybatis/typehandlers-threeten-extra?branch=master)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-typehandlers-threeten-extra/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-typehandlers-threeten-extra)
[![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/oss.sonatype.org/org.mybatis/mybatis-typehandlers-threeten-extra.svg)](https://oss.sonatype.org/content/repositories/snapshots/org/mybatis/mybatis-typehandlers-threeten-extra/)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

![mybatis](http://mybatis.github.io/images/mybatis-logo.png)

The MyBatis type handlers supporting types of [ThreeTen-Extra](http://www.threeten.org/threeten-extra/).

## Installation

If you are using Maven add the following dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>org.mybatis</groupId>
  <artifactId>mybatis-typehandlers-threeten-extra</artifactId>
  <version>1.0.0</version>
</dependency>
```

If you are using Gradle add the following dependency to your `build.gradle`:

```groovy
compile("org.mybatis:mybatis-typehandlers-threeten-extra:1.0.0")
```

## Configuration

Add following configuration to your `mybatis-config.xml`:

```xml
<typeHandlers>
  <!-- ... -->
  <package name="org.mybatis.typehandlers.threetenextra"/>
</typeHandlers>
```

## Supported types

The following type handlers are supported:

| Type handler | ThreeTen-Extra type | JDBC types |
| ------------ | ------------------- | ---------- |
| `DayOfMonthTypeHandler` | `org.threeten.extra.DayOfMonth` | `INTEGER` |
| `DayOfYearTypeHandler` | `org.threeten.extra.DayOfYear` | `INTEGER` |
| `SecondsTypeHandler` | `org.threeten.extra.Seconds` | `INTEGER` |
| `MinutesTypeHandler` | `org.threeten.extra.Minutes` | `INTEGER` |
| `HoursTypeHandler` | `org.threeten.extra.Hours` | `INTEGER` |
| `DaysTypeHandler` | `org.threeten.extra.Days` | `INTEGER` |
| `WeeksTypeHandler` | `org.threeten.extra.Weeks` | `INTEGER` |
| `MonthsTypeHandler` | `org.threeten.extra.Months` | `INTEGER` |
| `YearsTypeHandler` | `org.threeten.extra.Years` | `INTEGER` |
| `YearWeekTypeHandler` | `org.threeten.extra.YearWeek` | `VARCHAR` or `LONGVARCHAR` |
| `YearQuarterTypeHandler` | `org.threeten.extra.YearQuarter` | `VARCHAR` or `LONGVARCHAR` |

> **Note:**
>
> For more details of type handler, please refer to "[MyBatis 3 REFERENCE DOCUMENTATION](http://www.mybatis.org/mybatis-3/configuration.html#typeHandlers)".
