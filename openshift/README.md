## OpenShift Vagrant Image

Instructions shamelessly yanked from [Fabric8](https://github.com/fabric8io/fabric8-installer/tree/master/vagrant/openshift)

### Download and Install

* Download and install [VirtualBox](https://www.virtualbox.org/wiki/Downloads) 
* Download and install [Vagrant](http://www.vagrantup.com/downloads.html)
  
### Prepare Vagrant

The next steps are specific for different operating systems. They are needed to allow easy access to 
dynamically generated OpenShift routes. These steps are needed only once.

Some additional vagrant plugins are required to provide additional features like: 
* Plugin [landrush](https://github.com/phinze/landrush) provides a simple dns server for vagrant guests
* Plugin [host-manager](https://github.com/smdahlen/vagrant-hostmanager) manages the /etc/hosts file on guests within a multi-machine environment

#### Linux

* Install the Vagrant plugin `landrush`

````
vagrant plugin install vagrant-hostmanager
````

* Install `dnsmasq` so that all requests to `*.vagrant.openshift.dev` get resolved to the Vagrant VM's IP.
   
* Add a line `server=/vagrant.openshift.dev/127.0.0.1#10053` to the `dnsmasq` configuration.
   
For Ubuntu this looks like:

````
sudo apt-get install -y resolvconf dnsmasq
sudo sh -c 'echo "server=/vagrant.openshift.dev/127.0.0.1#10053" > /etc/dnsmasq.d/vagrant-landrush'
sudo service dnsmasq restart
````

These steps need to be performed only once. From now on, any new application route in OpenShift is visible on the host
as well.

#### OS X

* Install the Vagrant plugin `landrush`

That's it. OS X will automatically resolve now all routes to `*.vagrant.openshift.dev` your Vagrant VM. This is done vial OS X's resolver feature
(see `man 5 resolver` for details)

#### Windows

* Install Vagrant plugin `vagrant-hostmanager`

````
vagrant plugin install vagrant-hostmanager
````

There are some predefined routes which are automatically added to `%WINDIR%\System32\drivers\etc\hosts`. However if you 
add a new route e.g. by installing a new application, then you must adapt the hosts file manually 
for now for each new application so that it is reachable from this host.

### Start Vagrant

Now startup vagrant with

```
vagrant up
```
