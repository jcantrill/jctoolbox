FROM fedora:26

ENV USER=jcantril

ADD https://password.corp.redhat.com/RH-IT-Root-CA.crt /etc/pki/ca-trust/source/anchors/
WORKDIR /etc/yum.repos.d
RUN curl -L -O  http://download.devel.redhat.com/rel-eng/RCMTOOLS/rcm-tools-fedora.repo && \
    printf "[puddle-6]\nname=puddle-6\nbaseurl=http://download.lab.bos.redhat.com/rel-eng/repos/eng-rhel-7/x86_64/\ngpgcheck=0\nenabled=1\n" >> /etc/yum.repos.d/puddle.repo && \
    yum install -y rhpkg \
                   puddle \
                   krb5-workstation && \
    yum clean all && \
    adduser -g root ${USER} && \
    update-ca-trust && \
    mkdir ${HOME}/.koji && \
    echo "[brew]\nserver = http://brewhub.devel.redhat.com/brewhub\nno_ssl_verify = yes" > ${HOME}/.koji/config
ADD adduser $USER root
ADD krb5.conf /etc/
USER ${USER}
WORKDIR ${HOME}
