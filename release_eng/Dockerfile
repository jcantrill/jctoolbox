FROM fedora:25

ADD rcm-tools-fedora.repo /etc/yum.repos.d/
ADD krb5.conf /etc/krb5.conf
RUN dnf install rhpkg krb5-workstation wget -y
RUN wget https://password.corp.redhat.com/RH-IT-Root-CA.crt -O /etc/pki/ca-trust/source/anchors/RH-IT-Root-CA.crt --no-check-certificate && \
    wget https://password.corp.redhat.com/legacy.crt -O /etc/pki/ca-trust/source/anchors/legacy.crt --no-check-certificate && \
    wget https://engineering.redhat.com/Eng-CA.crt -O /etc/pki/ca-trust/source/anchors/Eng-CA.crt --no-check-certificate && \
    update-ca-trust

ENV USER jcantril
USER 1000
