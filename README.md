Java web crawler <br /> Simple java (1.8) crawler to crawl web pages <h1>Example<h1>
<p>add below maven dependency in pom.xml:<p><br />
		<p><dependency>
			<groupId>org.jsoup</groupId>
			<artifactId>jsoup</artifactId>
			<version>1.10.2</version>
			</dependency><p><br />
 Once we start application need to use route url and  pass parameter value of url and text(that we want to search) for example:
1- http://<Domain>:<PORT>/getLinks <br />
2- {
	"url":"<URL>",
	"text":"<TEXT>"
}

