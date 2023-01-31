# Introduction

This project demonstrates how katalon studio helps users to automate Power BI applications. It contains two powerBI applications with some sample test cases.

# Requirements

* [Katalon Studio][KS]
* PowerBI Account

# Use case

For the power app sample project we have two test cases for different-2 applications.

Powerapp Portal

           Test case - Login into the power app portal and Create a flagging Request.
           
PowerBI

         Test case - Create a Dashboard, create content and delete dashboard

# How to automate

**Costomize Setting before recording a test case**

* Go to project >> Settings >> Test Design >> WebUI and Change the priority of Xpath Locators. [Here][1]

![image](https://user-images.githubusercontent.com/84115288/214218084-b99e47c5-be63-49ad-89c2-fb4bcbcebb83.png)

* Record test script via Katalon Recorder. [Here][3]

* Save test objects and test cases.

* Run the test execution. [Here][5]

* Verify the test execution result. [Here][6]

**How to run this sample project**

* Update the application URL, Username, and Password inside the Default Profile. [Here][4]

![image](https://user-images.githubusercontent.com/84115288/215413135-6114c037-3f99-4a33-9b52-9805ab15628c.png)

* Run the test execution. [Here][5]

* Verify the test execution result. [Here][6]



**Repository for the [Sample Project][SP].**

[SP]: <https://github.com/katalon-studio-samples/katalon-powewbi-sample.git> "Sample Project"

[1]: <https://docs.katalon.com/docs/maintain/self-healing-tests-in-katalon-studio#configure-test-design> "Here"
[3]: <https://docs.katalon.com/docs/author/record-and-spy/webui-record-and-spy-utilities/record-web-utility-in-katalon-studio#record-a-new-test-case> "Here"
[4]: <https://docs.katalon.com/docs/author/data-driven-testing/global-variables-and-execution-profile#execution-profile> "Here"
[5]: <https://docs.katalon.com/docs/execute/execute-tests-with-katalon-studio/execute-tests-with-katalon-studio-overview#ariaid-title1> "Here"
[6]: <https://docs.katalon.com/docs/analyze/reports/view-test-reports/view-test-reports-in-katalon-testops/view-test-results-and-execution-logs-in-katalon-testops#ariaid-title1> "Here"
[KS]: <https://docs.katalon.com/docs/get-started/katalon-studio-installation/install-katalon-studio-on-macoswindows#download-katalon-studio> "Katalon Studio"
