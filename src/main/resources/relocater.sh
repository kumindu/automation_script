#!/bin/bash
echo  "####################################################################\n"
echo  "                     Automation web driver relocater                \n"
echo  "####################################################################\n"
echo  "@Author Kumindu Induranga Ranawaka             @Relase Date:29/02/18\n"
echo  "####################################################################\n"
echo
read -p 'Enter web driver relocating path (Default:/opt/resources/):' path
if[-d $path]
then
   sudo cp {chrome,edge,firefox,IE,opera} $path
   echo 'Web Driver files are relocated to:'.$path
   echo
   ls $path
   echo
   echo 'Example java code for application:'
   echo '\t\t\tnew WebDrivers(\"Lnx\","'.$path.'");'
else
  if[-d /opt/resources/]
   then
    if[-d /opt/resources/chrome]
     then
       read -p 'Chrome driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/chrome ;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d /opt/resources/edge]
     then
       read -p 'Edge driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/edge ;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d /opt/resources/firefox]
     then
       read -p 'Firefox driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/firefox ;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if[-d /opt/resources/IE]
     then
       read -p 'Internet Explora driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/IE ;;
          [Nn]* ) ;;
       *)
       esac
       sudo rm -r /opt/resources/IE
    fi
    if[-d /opt/resources/opera]
     then
       read -p 'Opera driver is loacted are you need relocating again?' yn
       case $yn in 
          [Yy]* ) sudo rm -r /opt/resources/opera ;;
          [Nn]* ) ;;
       *)
       esac
    fi
  else 
    sudo mkdir /opt/resources/
    sudo cp {chrome,edge,firefox,IE,opera} /opt/resources/
    echo 'Web Driver files are relocated to /opt/resources/'
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    echo '\t\t\tnew WebDrivers(\"Lnx\",\"//opt//resources//\");'
echo
echo  "####################################################################\n"
echo  "                             Version 1.0.0                          \n"
echo  "####################################################################\n"
