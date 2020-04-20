<?php

   $x = scandir('./');

   foreach ($x as $key ) {
       
    echo "<a href=$key>$key</a>";
       echo "<br/>";
       
   }


?>