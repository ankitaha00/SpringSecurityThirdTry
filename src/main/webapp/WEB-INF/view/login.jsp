
<html lang="en" xmlns:th="http://www.thymeleaf.org">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Login Page</title>
  </head>
  <body>

    <div class="container mt-5">
    <h1 class="text-center">Please Log In</h1>

    		<form action="home/login" method="POST">
              <div class="form-group">
                <input type="text" class="form-control" name="username" id="username" placeholder="Enter Your Username Here" required>
              </div>

              <div class="form-group">
                <input type="password" class="form-control" name="password" id="password" placeholder="Enter Your Password Here" required>
              </div>

              <div class="text-center">
              <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
  </body>
</html>