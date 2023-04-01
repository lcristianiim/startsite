## Prerequisites
* java 17
* node (19.03 initially used for development)
* sass (install sass like `npm install -g sass` or whatever method you preffer)
# Start app
## For development
#### Intellij
From Intellij with the start arrow on `src/main/java/ro/kluner/klunerpresentation/StartSite.java`
#### Command line via maven wrapper
1. ./mvnw clean package
2. java -cp target/classes:target/dependencies/* com.startup.startsitepresentation.StartSite
3. Spring boot will run on `localhost:8080`
## Live Reload
Live reload of html, css, js files is inspired by this article https://www.wimdeblauwe.com/blog/2022/07/03/thymeleaf-live-reload-with-npm-scripts/
### Via `live-reload.sh`
The above commands are also wrapped in `live-reload.sh`. So you can eiter run this script or the commands above.
### Manually running the needed scripts
1. `sass --watch src/main/resources/sass/:src/main/resources/static/css/`
2. start the spring boot app
3. `npm run build && npm run watch` will run `localhost:3000` with browser sync
4. open the browser on `localhost:3000` and enjoy
## CSS, js for development
npm run build
## CSS, js for production
npm run build:prod
# Running the appplication in production
1. run `mvn clean package`
2. run `java -jar target/startsite-<version>.jar`. I.e. `java -jar target/startsite-0.0.1-SNAPSHOT.jar`