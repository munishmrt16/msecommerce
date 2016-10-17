<jsp:include page="include.jsp" />
<script>
angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {pid:'p001',pcat:'tshirt',pname:'casual',pprice:'200'},
        {pid:'p002',pcat:'tshirt',pname:'formal',pprice:'300'},
        {pid:'p003',pcat:'shirt',pname:'casual',pprice:'400'},
        {pid:'p004',pcat:'shirt',pname:'formal',pprice:'500'},
        {pid:'p005',pcat:'jeans',pname:'casual',pprice:'1300'},
        {pid:'p006',pcat:'jeans',pname:'formal',pprice:'1200'},
        
        ];
    $scope.orderByMe = function(x) {
        $scope.myOrderBy = x;
    }
});

</script>
