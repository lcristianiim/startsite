#!/bin/bash
npm run build && npm run watch
sass --watch src/main/resources/sass/:src/main/resources/static/css/
