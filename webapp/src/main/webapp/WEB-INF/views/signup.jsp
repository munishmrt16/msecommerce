<jsp:include page="menu.jsp" />

<h1>Sign UP </h1>

<body>

<div class="container">
  <form class="form-horizontal">
  <div class="form-group">
      <label class="control-label col-sm-2" for="un">User Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="un" placeholder="Enter User Name" required>
      </div>
    </div>
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" placeholder="Enter email" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" required>
      </div>
    </div>
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>

</body>


<jsp:include page="footer.jsp" />