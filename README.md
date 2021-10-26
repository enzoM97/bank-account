# bank-account
Java monitor examples

Java version: 1.8 <br />
IDE: Eclipse

Download the project and open it with Eclipse, each package has its own Main class
* The first package *no_monitor*, is an example of how a concurrent program will work withoun any exclusion
* The second package *monitor*, implements the monitor with **synchronized** methods but without any cooperation/synchronized conditions
* The third package *coop_sync*, shows how a concurrent program should really work with monitors and cooperation/synchronized conditions
