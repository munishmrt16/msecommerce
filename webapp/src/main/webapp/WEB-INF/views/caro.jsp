<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="req" value="${pageContext.request}" />

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active" ></li>
      <li data-target="#myCarousel" data-slide-to="1" ></li>
      <li data-target="#myCarousel" data-slide-to="2" ></li>
      <li data-target="#myCarousel" data-slide-to="3" ></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <a href="${req.contextPath}/viewall/tshirt"> <img src="./resources/images/g1.jpg" alt="Chania" width="460" height="200"></a>
        
      </div>

      <div class="item">
        <a href="${req.contextPath}/viewall/shirt"> <img src="./resources/images/g2.jpg" alt="Chania" width="460" height="200"></a>
      </div>
    
      <div class="item">
        <a href="${req.contextPath}/viewall/jeans"> <img src="./resources/images/g3.jpg" alt="Chania" width="460" height="200"></a>
      </div>

      <div class="item">
		<a href="${req.contextPath}/viewall/tshirt"> <img src="./resources/images/g4.jpg" alt="Chania" width="460" height="200"></a>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

  <div class="row hidden-xs" id="slider-thumbs">
                        <!-- Bottom switcher of slider -->
                        <ul class="hide-bullets">
                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-0" href="${req.contextPath}/viewall/tshirt"><img src="./resources/images/g1.jpg"></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-1" href="${req.contextPath}/viewall/shirt"><img src="./resources/images/g2.jpg" ></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-2" href="${req.contextPath}/viewall/jeans"><img src="./resources/images/g3.jpg" ></a>
                            </li>

                            <li class="col-sm-2">
                                <a class="thumbnail" id="carousel-selector-3" href="${req.contextPath}/viewall/tshirt"><img src="./resources/images/g4.jpg" ></a>
                            </li>

                        </ul>                 
                </div>
        </div>
  