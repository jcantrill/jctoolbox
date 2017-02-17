FROM node:4.7.3
EXPOSE 9999

ENV OUT_FILE ""

ADD package.json /app/
RUN cd /app && npm install

RUN mkdir -p /app/files
RUN mkdir -p /app/public
ADD logtest.js /app/
ADD files/* /app/files
ADD public/* /app/public

WORKDIR /app
CMD ["node","logtest"]
