griffon.project.dependency.resolution = {
    inherits "global"
    log "warn" 
    repositories {
        griffonHome()
        mavenCentral()
    }
    dependencies {
        compile('eu.hansolo:SteelSeries:3.9.23') {
            excludes 'trident'
        }
        compile('com.github.insubstantial:trident:6.3') { transitive = false }
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}