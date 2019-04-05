<?php
   $dbhost = 'localhost';
   $dbuser = 'root';
   $dbpass = '';
   $dbname = 'heroes';
   $conn = mysqli_connect($dbhost, $dbuser, $dbpass,$dbname);
   
   if(! $conn ) {
      die('Could not connect: ' . mysqli_error());
   }
   echo 'Connected successfully</br>';
   $sql = ' SELECT a.id, a.name FROM superheroes 
              INNER JOIN details 
              ON a.id=details.id 
              WHERE details.age>=80';


           
   
   if($result = mysqli_query($conn, $sql)) {
      if(mysqli_num_rows($result) > 0) {
         echo "<table>";
         echo "<tr>";
         echo "<th>id</th>";
         echo "<th>name</th>";
         echo "<th>power</th>";

         echo "<th>gender</th>";
         echo "<th>age</th>";

         echo "<th>COUNTRY</th>";
         echo "</tr>";
         
         while($row = mysqli_fetch_array($result)){
            echo "<tr>";
            echo "<td>" . $row['id'] . "</td>";
            echo "<td>" . $row['name'] . "</td>";

            echo "<td>" . $row['power'] . "</td>";

            echo "<td>" . $row['gender'] . "</td>";
            echo "<td>" . $row['age'] . "</td>";

            echo "<td>" . $row['country'] . "</td>";
            echo "</tr>";
         }
         echo "</table>";
         mysqli_free_result($result);
      } else {
         echo "No records matching your query were found.";
      }
   } else {
      echo "ERROR: Could not able to execute $sql. " . mysqli_error($conn);
   }
   mysqli_close($conn);
?>