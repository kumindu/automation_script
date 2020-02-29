#!/bin/bash
echo  "####################################################################\n"
echo  "          Automation web driver relocater  && Deployer              \n"
echo  "####################################################################\n"
echo  "@Author Kumindu Induranga Ranawaka             @Relase Date:29/02/18\n"
echo  "####################################################################\n"
echo
read -p 'Enter web driver relocating path (Default:/opt/resources/)[ENTER]:' path
if [ ! -z "$path"]; then
	if [ -d "$path"]; then
    if [ -d "$path"/resources/chrome ]; then
    	 echo
    	 echo 'Current directory '.$path.'/resources/chrome content:'
     	 ls $path/resources/chrome
     	 echo
       read -p 'Chrome driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r $path/resources/chrome;sudo cp chrome $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d  "$path"/resources/edge ]; then
    	 echo
    	 echo 'Current directory '.$path.'/resources/edge content:'
     	 ls  $path/resources/edge
     	 echo
       read -p 'Edge driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r $path/resources/edge;sudo cp edge $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d  "$path"/resources/firefox ]; then
    	 echo
    	 echo 'Current directory '.$path.'/resources/firefox content:'
     	 ls  $path/resources/firefox
     	 echo
       read -p 'Firefox driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/resources/firefox;sudo cp firefox $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d  "$path"/resources/IE ]; then
    	 echo
    	 echo 'Current directory '.$path.'/resources/Internet Explora content:'
     	 ls  $path/resources/IE
     	 echo
       read -p 'Internet Explora driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/resources/IE ;sudo cp IE $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
       sudo rm -r  $path/resources/IE
    fi
    if [ -d  "$path"/resources/opera ]; then
    	 echo
    	 echo 'Current directory '.$path.'/resources/opera content:'
     	 ls  $path/resources/opera
     	 echo
       read -p 'Opera driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/resources/opera ;sudo cp opera $path/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
  else
  	sudo cp -R * $path
    echo 'Web Driver files are relocated to:'.$path
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    echo '\t\tnew WebDrivers("Lnx","'.$path.'");'
   fi
else
  if [ -d /opt/resources/ ]; then
    if [ -d /opt/resources/chrome ]; then
    	 echo
    	 echo 'Current directory /opt/resources/chrome content:'
     	 ls /opt/resources/chrome
     	 echo
       read -p 'Chrome driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/chrome ;sudo cp chrome /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/edge ]; then
     	 echo
    	 echo 'Current directory /opt/resources/edge content:'
     	 ls /opt/resources/edge
     	 echo
       read -p 'Edge driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/edge ;sudo cp edge /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/firefox ]; then
     	 echo
    	 echo 'Current directory /opt/resources/firefox content:'
     	 ls /opt/resources/firefox
     	 echo
       read -p 'Firefox driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/firefox ;sudo cp firefox /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/IE ]; then
     	 echo
    	 echo 'Current directory /opt/resources/IE content:'
     	 ls /opt/resources/IE
     	 echo
       read -p 'Internet Explora driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/IE ;sudo cp IE /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/opera ]; then
     	 echo
    	 echo 'Current directory /opt/resources/opera content:'
     	 ls /opt/resources/opera
     	 echo
       read -p 'Opera driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/opera ;sudo cp opera /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
  else
    sudo mkdir /opt/resources
    sudo cp -R * /opt/resources/
    echo 'Web Driver files are relocated to /opt/resources/'
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    echo '\t\tnew WebDrivers("Lnx","/opt/resources/");'
  fi
fi
echo
echo  "####################################################################\n"
echo  "                        WebDrivers Relocted                         \n"
echo  "####################################################################\n"
