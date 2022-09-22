# Java web crawler
### Simple java (1.8) crawler to crawl web pages.
#### add below maven dependency in pom.xml.
		```
		<dependency>
			<groupId>org.jsoup</groupId>
			<artifactId>jsoup</artifactId>
			<version>1.10.2</version>
		</dependency>
		```
 ### Once we start application need to use route url and  pass parameter value of url and text(that we want to search) for example.
* http://<\Domain\>:<\PORT\>/getLinks <br />
* {
	"url":"<URL>",
	"text":"<TEXT>"
   }

