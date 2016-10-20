<jsp:include page="include.jsp" />
<jsp:include page="menu.jsp" />

<h1>Contact US </h1>

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
   <label class="control-label col-sm-2" for="email">Name:</label>
   <div class="col-sm-10">
<input name="myName" ng-model="myName" placeholder="Enter Name"  class="form-control" required>
<span ng-show="myForm.myName.$touched && myForm.myName.$invalid">The name is required.</span>
   </div>
    </div>

	<div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" ng-model="myInput" class="form-control" id="email" placeholder="Enter email" name="myInput" required>
        <span ng-show="myForm.myInput.$touched && myForm.myInput.$invalid">The E Mail is required.</span>
       </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="cnum">Contact Number:</label>
      <div class="col-sm-10">
        <input name="myName1" ng-model="myName1" placeholder="Enter Contact Number"  class="form-control" required>
        <span ng-show="myForm.myName1.$touched && myForm.myName1.$invalid">The Contact Number is required.</span>
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