<jsp:include page="include.jsp" />
<jsp:include page="menu.jsp" />

<h1>Sign In </h1>

<style>
input.ng-invalid {
    background-color:pink;
}
input.ng-valid {
    background-color:lightgreen;
}
</style>

<body ng-app="">

<div class="container">
  <form class="form-horizontal" name="myForm">
  
  	<div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" ng-model="myInput" class="form-control" id="email" placeholder="Enter email" name="myInput" required>
        <span ng-show="myForm.myInput.$touched && myForm.myInput.$invalid">The E Mail is required.</span>
       </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">
        <input type="password" ng-model="pwd" class="form-control"  id="pwd" placeholder="Enter password" name="pwd" required>
        <span ng-show="myForm.pwd.$touched && myForm.pwd.$invalid">The Password is required.</span>
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