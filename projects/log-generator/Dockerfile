FROM node:4.7.3

ENV MSG_PER_SEC "1"
ENV MSG_SIZE "1000"

RUN mkdir -p /app/files
ADD package.json log-generator.js /app/
ADD files/* /app/files
WORKDIR /app
RUN npm install

CMD ["node","log-generator"]
