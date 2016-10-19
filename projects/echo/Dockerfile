FROM fedora:22
EXPOSE 9999

RUN mkdir /app
ADD echo.js package.json /app/
RUN dnf install nodejs npm -y && cd /app && npm install

WORKDIR /app
CMD ["/usr/bin/node","echo"]
