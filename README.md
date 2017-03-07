# MyBatis Type Handlers for ThreeTen-Extra

[![Build Status](https://travis-ci.org/mybatis/typehandlers-threeten-extra.svg?branch=master)](https://travis-ci.org/mybatis/typehandlers-threeten-extra)
[![Coverage Status](https://coveralls.io/repos/github/mybatis/typehandlers-threeten-extra/badge.svg?branch=master)](https://coveralls.io/github/mybatis/typehandlers-threeten-extra?branch=master)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-typehandlers-threeten-extra/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis-typehandlers-threeten-extra)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

The following type handlers are supported:

```xml
<typeHandlers>
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.AmPmTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.DayOfMonthTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.DayOfYearTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.DaysTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.HoursTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.MinutesTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.MonthsTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.QuarterTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.WeeksTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.YearQuarterTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.YearWeekTypeHandler" />
  <typeHandler handler="org.mybatis.typehandlers.threetenextra.YearsTypeHandler" />
</typeHandlers>
```

# References

* [ThreeTen-Extra](http://www.threeten.org/threeten-extra/)