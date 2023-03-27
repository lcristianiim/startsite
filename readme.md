## Prerequisites
* java 17
* node
* sass (install sass like `npm install -g sass` or whatever method you preffer)
## Start app
#### Intellij
From Intellij with the start arrow on `src/main/java/ro/kluner/klunerpresentation/StartSite.java`
#### Command line via maven wrapper
1. ./mvn clean package
2. java -jar target startsite-0.0.1-SNAPSHOT.jar
3. Spring boot will run on `localhost:8080`
## CSS, js for development
npm run build
## CSS, js for production
npm run build:prod
## Live Reload
Live reload of html, css, js files is based on this article https://www.wimdeblauwe.com/blog/2022/07/03/thymeleaf-live-reload-with-npm-scripts/
1. `sass --watch src/main/resources/sass/:src/main/resources/static/css/`
2. start the spring boot app
3. `npm run build && npm run watch` will run `localhost:3000` with browser sync
4. open the browser on `localhost:3000` and enjoy