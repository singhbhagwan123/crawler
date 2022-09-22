# <h1>Java web crawler<h1><br /><h3>Simple java (1.8) crawler to crawl web pages<h3><br /><h1>Example<h1><br />
<h3>add below maven dependency in pom.xml:
			<dependency>
			<groupId>org.jsoup</groupId>
			<artifactId>jsoup</artifactId>
			<version>1.10.2</version>
			</dependency>
<h3> Once we start application need to use route url and  pass parameter value of url and text(that we want to search) for example:
1- http://<Domain>:<PORT>/getLinks <br />
2- {
	"url":"<URL>",
	"text":"<TEXT>"
}

