## the strategy is base on https://www.wimdeblauwe.com/blog/2022/07/03/thymeleaf-live-reload-with-npm-scripts/
## CSS, js for development
npm run build
## CSS, js for production
npm run build:prod
## Live Reload
`npm run build && npm run watch` will run `localhost:3000` with browser sync
## Sass
1. install sass like `npm install -g sass
   ` or whatever method you preffer