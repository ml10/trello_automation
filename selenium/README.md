Trello regression
=====================

##### Minimum steps to get started running tests on your local machine
- Download the latest chrome driver here https://sites.google.com/a/chromium.org/chromedriver/downloads
  - The download should contain one file, `chromedriver`. This file needs to be somewhere on your PATH.
- For Firefox support, download the latest geckodriver here: https://github.com/mozilla/geckodriver/releases
  - The download should contina one file, `geckodriver`. This file needs to be somewhere on your PATH.

### Properties needed by the steps:
1. trello.login.username
2. trello.login.password

### Running from the command line
#### Chrome - chromedriver

```
mvn -P featureTest -Dwebdriver.chrome.driver=<pasth to chromedriver> -Dtrello.login.username=<trello username> -Dtrello.login.password=<trello password> test
```

#### Firefox - geckodriver
```
mvn -P featureTest -DBROWSER=firefox -Dwebdriver.gecko.driver=<path to geckodriver> -Dtrello.login.username=<trello username> -Dtrello.login.password=<trello password> test
```
