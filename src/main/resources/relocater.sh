#!/bin/bash
echo  "####################################################################\n"
echo  "          Automation web driver relocater  && Deployer              \n"
echo  "####################################################################\n"
echo  "@Author Kumindu Induranga Ranawaka             @Relase Date:29/02/18\n"
echo  "####################################################################\n"
echo
read -p 'Enter web driver relocating path (Default:/opt/resources/):' path
if[! -z "$path"]
then
	if[-d "$path"]
   then
    if[-d "$path/resources/chrome"]
     then
     	 ls $path/resources/chrome
       read -p 'Chrome driver is loacted are you need relocating again?' yn
       case $yn in
          [Yy]* ) sudo rm -r $path/resources/chrome;sudo cp chrome $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d  "$path/resources/edge"]
     then
     	 ls  $path/resources/edge
       read -p 'Edge driver is loacted are you need relocating again?' yn
       case $yn in
          [Yy]* ) sudo rm -r $path/resources/edge;sudo cp edge $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d  "$path/resources/firefox"]
     then
     	 ls  $path/resources/firefox
       read -p 'Firefox driver is loacted are you need relocating again?' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/resources/firefox;sudo cp firefox $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d  "$path/resources/IE"]
     then
     	 ls  $path/resources/IE
       read -p 'Internet Explora driver is loacted are you need relocating again?' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/resources/IE ;sudo cp IE $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
       sudo rm -r  $path/resources/IE
    fi
    if[-d  "$path/resources/opera"]
     then
     	 ls  $path/resources/opera
       read -p 'Opera driver is loacted are you need relocating again?' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/resources/opera ;sudo cp opera $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
  else
  	sudo cp {chrome,edge,firefox,IE,opera} $path
    echo 'Web Driver files are relocated to:'.$path
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    echo '\t\t\tnew WebDrivers(\"Lnx\","'.$path.'");'
  fi
fi
else
  if[-d "/opt/resources/"]
   then
    if[-d "/opt/resources/chrome"]
     then
     	 ls /opt/resources/chrome
       read -p 'Chrome driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/chrome ;sudo cp chrome /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d "/opt/resources/edge"]
     then
     	 ls /opt/resources/edge
       read -p 'Edge driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/edge ;sudo cp edge /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d "/opt/resources/firefox"]
     then
     	 ls /opt/resources/firefox
       read -p 'Firefox driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/firefox ;sudo cp firefox /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d "/opt/resources/IE"]
     then
     	 ls /opt/resources/IE
       read -p 'Internet Explora driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/IE ;sudo cp IE /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
       sudo rm -r /opt/resources/IE
    fi
    if[-d "/opt/resources/opera"]
     then
     	 ls /opt/resources/opera
       read -p 'Opera driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/opera ;sudo cp opera /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
  else 
    sudo mkdir /opt/resources
    sudo cp {chrome,edge,firefox,IE,opera} /opt/resources/
    echo 'Web Driver files are relocated to /opt/resources/'
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    echo '\t\t\tnew WebDrivers(\"Lnx\",\"//opt//resources//\");'
echo
echo  "####################################################################\n"
echo  "                        WebDrivers Relocted                         \n"
echo  "####################################################################\n"
