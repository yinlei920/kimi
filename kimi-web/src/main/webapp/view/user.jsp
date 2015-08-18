<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World!</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>



	<link rel="stylesheet" href="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/style.css?ver=3.16" type="text/css" media="screen" />
	<link rel="stylesheet" href="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/css/style.css?ver=3.24" type="text/css" media="screen" />




</head>
<!-- 

	<s:property value="userdo.name"/></br>
	<s:property value="userdo.userName"/></br>
	<s:property value="userdo.cars"/></br>
	<s:property value="userdo.gmtCreate"/></br>

 -->




<body>
	<!-- BuySellAds.com Ad Code -->
	<script type="text/javascript">
	(function(){
  		var bsa = document.createElement('script');
    	bsa.type = 'text/javascript';
    	bsa.async = true;
  		bsa.src = '//s3.buysellads.com/ac/bsa.js';
 		(document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);
	})();
	</script> 
	<!-- END BuySellAds.com Ad Code -->

<nav class="js-menu sliding-menu-content">
  <ul>
  	<li class="section"><h2>Categories</h2></li>
    	<li class="cat-item cat-item-1"><a href="http://www.onextrapixel.com/category/inspiration/" >Inspiration</a>
</li>
	<li class="cat-item cat-item-3"><a href="http://www.onextrapixel.com/category/design/" >Design</a>
</li>
	<li class="cat-item cat-item-4"><a href="http://www.onextrapixel.com/category/development/" >Development</a>
</li>
	<li class="cat-item cat-item-6"><a href="http://www.onextrapixel.com/category/graphics/" >Graphics</a>
</li>
	<li class="cat-item cat-item-13"><a href="http://www.onextrapixel.com/category/css/" >CSS</a>
</li>
	<li class="cat-item cat-item-43"><a href="http://www.onextrapixel.com/category/wordpress/" >WordPress</a>
</li>
	<li class="cat-item cat-item-120"><a href="http://www.onextrapixel.com/category/social-media/" >Social Media</a>
</li>
	<li class="cat-item cat-item-164"><a href="http://www.onextrapixel.com/category/articles/" >Articles</a>
</li>
	<li class="cat-item cat-item-177"><a href="http://www.onextrapixel.com/category/giveaways/" >Giveaways</a>
</li>
	<li class="cat-item cat-item-179"><a href="http://www.onextrapixel.com/category/toolkits/" >Toolkits</a>
</li>
	<li class="cat-item cat-item-292"><a href="http://www.onextrapixel.com/category/events/" >Events</a>
</li>
    <li class="section"><h2>Info</h2></li>
    <li><a href="/about/">About</a></li>
	<li><a href="/contact/">Contact</a></li>
	<li><a href="/write-for-us/">Write for Us</a></li>
	<li><a href="/advertise/" rel="nofollow" target="_blank">Advertise</a></li>
  </ul>
</nav>

<div class="js-menu-screen menu-screen"></div>

<div class="header" id="sticky-header">
	<div class="js-menu-trigger sliding-menu-button">
		<i class="icon-menu"></i>
	</div>
	<div class="container">
		<div class="header-left">
			<a class="header-left__logo" href="/" title="OXP Home"><img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/logo.png" alt="OXP" /></a>

			<ul class="header-left__main-nav">
								
				<li ><a class="header-left__main-pri" href="/category/tutorials/">Tutorials</a></li>
				<li ><a class="header-left__main-pri" href="/category/freebies/">Freebies</a></li>
				<li ><a class="header-left__main-pri" href="/comics/">Comics</a></li>
				<li ><a class="header-left__main-pri" href="/offers/">Offers</a></li>
				<li><a class="header-left__main-pri" href="http://gallery.onextrapixel.com">Gallery</a></li>
			
				<li class="dropdown header-left__dropdown">
					<a data-toggle="dropdown" href="#">Section <i class="icon-down-dir"></i></a>
				  	<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
				    							<li ><a href="/category/tutorials/">Tutorials</a></li>
						<li ><a href="/category/freebies/">Freebies</a></li>
						<li ><a href="/comics/">Comics</a></li>
						<li ><a href="/offers/">Offers</a></li>
				  		<li><a href="http://gallery.onextrapixel.com">Gallery</a></li>
				  	</ul>
				</li>
			</ul>
		</div>

		<div class="header-right">
			<ul>
				<li class="dropdown">
					<a title="Search on Onextrapixel" class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="icon-search"></i></a>
<div class="dropdown-menu dropdown__search">
	<form action="http://www.onextrapixel.com/search" id="cse-search-box" class="sform">	
		<input type="hidden" name="cx" value="partner-pub-5606861741839360:7269055064" />
	    <input type="hidden" name="cof" value="FORID:10" />
	    <input type="hidden" name="ie" value="UTF-8" />
	    <input type="text" name="q" class="s" placeholder="Search on Onextrapixel" />
	    <!-- <input type="submit" name="sa" value="Search" class="searchbtn" /> -->
	</form>
</div>				</li>
				<li class="header-right__sm-link"><a class="head-right__fb" href="http://www.facebook.com/onextrapixel" title="Facebook" target="_blank" rel="nofollow"><i class="icon-facebook"></i></a></li>
				<li class="header-right__sm-link"><a class="head-right__tw" href="https://twitter.com/onextrapixel" title="Twitter" target="_blank" rel="nofollow"><i class="icon-twitter"></i></a></li>
				<li class="header-right__sm-link"><a class="head-right__go" href="https://plus.google.com/109899088134183441441" title="Google+" target="_blank" rel="nofollow"><i class="icon-gplus"></i></a></li>
				<li class="header-right__sm-link"><a class="head-right__pi" href="https://pinterest.com/onextrapixel" title="Pinterest" target="_blank" rel="nofollow"><i class="icon-pinterest"></i></a></li>
				<li class="header-right__sm-link"><a class="head-right__rss" href="http://feeds.feedburner.com/onextrapixel" title="RSS Feed" target="_blank" rel="nofollow"><i class="icon-rss"></i></a></li>
			
				<li class="dropdown header-right__dropdown">
					<a data-toggle="dropdown" class="dropdown-toggle" href="#"><i class="icon-facebook"></i><i class="icon-twitter"></i><i class="icon-down-dir"></i></a>
				  	<ul class="dropdown-menu pull-right" role="menu" aria-labelledby="dLabel">
				    	<li><a class="head-right__fb" href="http://www.facebook.com/onextrapixel" title="Facebook" target="_blank" rel="nofollow"><i class="icon-facebook"></i></a></li>
						<li><a class="head-right__tw" href="https://twitter.com/onextrapixel" title="Twitter" target="_blank" rel="nofollow"><i class="icon-twitter"></i></a></li>
						<li><a class="head-right__go" href="https://plus.google.com/109899088134183441441" title="Google+" target="_blank" rel="nofollow"><i class="icon-gplus"></i></a></li>
						<li><a class="head-right__pi" href="https://pinterest.com/onextrapixel" title="Pinterest" target="_blank" rel="nofollow"><i class="icon-pinterest"></i></a></li>
						<li><a class="head-right__rss" href="http://feeds.feedburner.com/onextrapixel" title="RSS Feed" target="_blank" rel="nofollow"><i class="icon-rss"></i></a></li>
				  	</ul>
				</li>
			</ul>
		</div>
	</div>
</div>
<div class="top-banner">
	<div class="top-banner__ads"> 
		<!-- BuySellAds.com Zone Code -->
		<div id="bsap_1243230" class="bsarocks bsap_bcc688b2059ea2d9f46c4ca12eea9ac0"></div>
		<!-- END BuySellAds.com Zone Code -->
	</div>
</div>	
<div class="container">
	<div class="main-full">
		<div class="content">
			<div class="featured">
				<div class="featured__left">
						

						<a class="featured-box__surface" href="http://www.onextrapixel.com/2015/05/15/storytelling-and-interaction-engage-your-visitors/">
							<div class="featured-box__bg" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/storytelling-thumb-960x540.jpg);">&nbsp;</div>
							<div class="featured-box__img-shadow"></div>
						</a>
						<div class="featured-box__info">
							<span class="featured-box__meta"><a href="http://www.onextrapixel.com/author/nataly-birch/" title="Posts by Nataly Birch" rel="author">Nataly Birch</a> &middot; <a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a> &middot; 15th May 2015</span>
							<h2>
								<a href="http://www.onextrapixel.com/2015/05/15/storytelling-and-interaction-engage-your-visitors/" title="Storytelling and Interaction: Engage Your Visitors">
									Storytelling and Interaction: Engage Your Visitors								</a>
							</h2>
						</div>

									</div>

				<div class="featured__right">
					<h5>Trending Now</h5>
					<ul>
							
							
							<li>
								<a href="http://www.onextrapixel.com/2015/05/14/navigation-that-adds-to-aesthetics-best-practices/" title="Navigation That Adds to Aesthetics – Best Practices">
									Navigation That Adds to Aesthetics – Best Practices								</a>
							</li>

							
							
							<li>
								<a href="http://www.onextrapixel.com/2015/05/13/15-worst-ui-design-features-to-watch-out-for-and-overcome/" title="15 Worst UI Design Features to Watch Out For and Overcome">
									15 Worst UI Design Features to Watch Out For and Overcome								</a>
							</li>

							
							
							<li>
								<a href="http://www.onextrapixel.com/2015/05/12/pinterest-inspired-cards-based-web-design-layouts/" title="Pinterest-Inspired Cards-Based Web Design Layouts">
									Pinterest-Inspired Cards-Based Web Design Layouts								</a>
							</li>

							
							
							<li>
								<a href="http://www.onextrapixel.com/2015/05/10/design-of-complex-forms-for-responsiveness-accessibility-and-friction-free-experience/" title="Design of Complex Forms: For Responsiveness, Accessibility and Friction Free Experience">
									Design of Complex Forms: For Responsiveness, Accessibility and Friction Free Experience								</a>
							</li>

							
							
							<li>
								<a href="http://www.onextrapixel.com/2015/05/08/motivational-bold-and-catchy-smart-taglines-in-website-design/" title="Motivational, Bold and Catchy Smart Taglines in Website Design">
									Motivational, Bold and Catchy Smart Taglines in Website Design								</a>
							</li>

											</ul>
				</div>
			</div>

				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/05/06/lets-not-skip-it-website-designs-featuring-top-notch-video-intros/" title="Let&#8217;s Not Skip It – Website Designs Featuring Top-Notch Video Intros" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/03/videointro-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/05/06/lets-not-skip-it-website-designs-featuring-top-notch-video-intros/" title="Let&#8217;s Not Skip It – Website Designs Featuring Top-Notch Video Intros">Let&#8217;s Not Skip It – Website Designs Featuring Top-Notch Video Intros</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a></span> 
							<span class="post__excerpt"><p>&#8220;Skip it or not&#8221; &#8211; sometimes it can be a quite dilemma especially when we face websites with video intros. Whether we have the spare time or we are just not in the mood, there are numerous reasons that push us to pass up; however, if &#8220;all of the planets align&#8221; or simply the first&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/nataly-birch/" title="Posts by Nataly Birch" rel="author">Nataly Birch</a></span> &middot;
								<span class="post__date">6th May 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/05/06/iq-option-a-great-website-and-app-with-an-innovative-design/" title="IQ Option – A Great Website and App with an Innovative Design" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/iq-option-app-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/05/06/iq-option-a-great-website-and-app-with-an-innovative-design/" title="IQ Option – A Great Website and App with an Innovative Design">IQ Option – A Great Website and App with an Innovative Design</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/design/" rel="category tag">Design</a></span> 
							<span class="post__excerpt"><p>IQ Option is an online Binary Options Broker who have created an amazing website and have developed a complimentary app for both iOS and Android. The team have worked extremely hard on functionality of their site and app, but they have also very seriously addressed the issues of design and ease of use. They are&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/onextrapixel-team/" title="Posts by Onextrapixel Team" rel="author">Onextrapixel Team</a></span> &middot;
								<span class="post__date">6th May 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/05/05/15-free-responsive-wordpress-themes-for-photographers-and-photo-bloggers/" title="15 Free Responsive WordPress Themes for Photographers and Photo Bloggers" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/themes-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/05/05/15-free-responsive-wordpress-themes-for-photographers-and-photo-bloggers/" title="15 Free Responsive WordPress Themes for Photographers and Photo Bloggers">15 Free Responsive WordPress Themes for Photographers and Photo Bloggers</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/wordpress/" rel="category tag">WordPress</a></span> 
							<span class="post__excerpt"><p>With the launch of such popular social networking platforms as Instagram and Facebook, interest in photography has boomed over the last decade. Some people want to capture every single moment of their lives and share the things they value the most with their friends and followers online. For many others, photography is more than just&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/helen-bailey/" title="Posts by Helen Bailey" rel="author">Helen Bailey</a></span> &middot;
								<span class="post__date">5th May 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/29/new-web-design-and-development-resources-6-april-edition/" title="New Web Design and Development Resources: #6 April Edition" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/resources-april-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/29/new-web-design-and-development-resources-6-april-edition/" title="New Web Design and Development Resources: #6 April Edition">New Web Design and Development Resources: #6 April Edition</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/toolkits/" rel="category tag">Toolkits</a></span> 
							<span class="post__excerpt"><p>We&#8217;re here once more to enlighten you with some of the best free resources for both developers and designers alike. This time, we have code snippets, poster designs, icons, coding tools and many other surprises in store for you. You&#8217;d better free up some time and hard drive space, because we&#8217;re sure you won&#8217;t be&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/juan-pablo-sarmeinto/" title="Posts by Juan Pablo Sarmiento" rel="author">Juan Pablo Sarmiento</a></span> &middot;
								<span class="post__date">29th Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/28/airline-website-design-the-best-examples/" title="Airline Website Design – The Best Examples" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/airlines-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/28/airline-website-design-the-best-examples/" title="Airline Website Design – The Best Examples">Airline Website Design – The Best Examples</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a></span> 
							<span class="post__excerpt"><p>Besides the use of airports to function, airlines need a website and/or app to create sales and attract potential customers.The problem with designing for airlines is that so much information has to go on the landing page – there has to be a form for inputting flight dates, and special offer information, etc. This means&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/carol-francis/" title="Posts by Carol Francis" rel="author">Carol Francis</a></span> &middot;
								<span class="post__date">28th Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/27/why-you-cant-afford-to-miss-the-ux-strategies-summit-2015/" title="Why You Can’t Afford to Miss the UX Strategies Summit 2015!" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/summit-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/27/why-you-cant-afford-to-miss-the-ux-strategies-summit-2015/" title="Why You Can’t Afford to Miss the UX Strategies Summit 2015!">Why You Can’t Afford to Miss the UX Strategies Summit 2015!</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/events/" rel="category tag">Events</a></span> 
							<span class="post__excerpt"><p>David had come to the end of his rope. His once-promising business venture – into which he sunk not just his money, but funds from friends and family — was sinking into quicksand because he had failed to take the most basic steps to make &#8220;user experience&#8221; his number one priority. He needed help. Now&#8230;.</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/onextrapixel-team/" title="Posts by Onextrapixel Team" rel="author">Onextrapixel Team</a></span> &middot;
								<span class="post__date">27th Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/25/louder-than-words-custom-photography-in-website-design/" title="Louder Than Words: Custom Photography in Website Design" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/03/customphotos-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/25/louder-than-words-custom-photography-in-website-design/" title="Louder Than Words: Custom Photography in Website Design">Louder Than Words: Custom Photography in Website Design</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a></span> 
							<span class="post__excerpt"><p>Images speak louder than words, and when it comes to custom photography, it simply screams out. Made-to-order snapshots manage to shift the principal focus on visuals in a fraction of a second. The produced effect from utilization of stock images is not nearly as good as from implementing professionally performed photo shots that perfectly reflect&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/nataly-birch/" title="Posts by Nataly Birch" rel="author">Nataly Birch</a></span> &middot;
								<span class="post__date">25th Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/23/express-your-personality-through-an-online-portfolio-great-examples/" title="Express Your Personality Through An Online Portfolio – Great Examples" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/03/portfolios-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/23/express-your-personality-through-an-online-portfolio-great-examples/" title="Express Your Personality Through An Online Portfolio – Great Examples">Express Your Personality Through An Online Portfolio – Great Examples</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a></span> 
							<span class="post__excerpt"><p>Numerous people have noted the growth of personal online portfolios these days. More and more designers, developers, art directors and other creative folk refuse to work in the shadow of a company and seek to carve out a path to successful solo career, having opened the new era of sophisticated, interactive and original web projects&#8230;.</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/nataly-birch/" title="Posts by Nataly Birch" rel="author">Nataly Birch</a></span> &middot;
								<span class="post__date">23rd Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/22/evolution-of-the-camera/" title="Evolution of The Camera" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/04/01-cameras-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/22/evolution-of-the-camera/" title="Evolution of The Camera">Evolution of The Camera</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a></span> 
							<span class="post__excerpt"><p>Among various other stuff that we own and use a lot, cameras definitely play an important role in our daily life. We freeze great moments from our life in the form of photographs using this little tool, and for emotional beings such as us, this means a lot. However, it took a great deal of&#8230;</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/rahul-chowdhury/" title="Posts by Rahul Chowdhury" rel="author">Rahul Chowdhury</a></span> &middot;
								<span class="post__date">22nd Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
				
				<div class="post">
					<div class="post__thumb">
												<a class="post__bg" href="http://www.onextrapixel.com/2015/04/21/ditching-large-images-the-absence-of-large-header-background-images/" title="Ditching Large Images: The Absence of Large Header Background Images" style="background-image: url(http://cdn.onextrapixel.com/wp-content/uploads/2015/03/largeimages-thumb-640x360.jpg);"></a>
					</div>
				
					<div class="post__body">	
						<h2 class="post__title"><a href="http://www.onextrapixel.com/2015/04/21/ditching-large-images-the-absence-of-large-header-background-images/" title="Ditching Large Images: The Absence of Large Header Background Images">Ditching Large Images: The Absence of Large Header Background Images</a></h2>
						<div class="post__summary">	
							<span class="post__category"><a href="http://www.onextrapixel.com/category/inspiration/" rel="category tag">Inspiration</a></span> 
							<span class="post__excerpt"><p>Although the utilization of impressive images as a header background is considered to be a huge web design trend, it seems that not everyone has a burning desire to follow the tendency and join the mainstream. Instead, some folks go for opposite tactics and prefer ditching wide-screen pictures in favor of clean, solid color backdrops&#8230;.</p>
</span>
						
							<div class="post__meta">
								<span class="post__author"><a href="http://www.onextrapixel.com/author/nataly-birch/" title="Posts by Nataly Birch" rel="author">Nataly Birch</a></span> &middot;
								<span class="post__date">21st Apr 2015</span>
							</div>
						</div>
					</div>
				</div>
			
			<div class='wp-pagenavi'>
<span class='current'>1</span><a class="page larger" href="http://www.onextrapixel.com/page/2/">2</a><a class="page larger" href="http://www.onextrapixel.com/page/3/">3</a><span class='extend'>...</span><a class="larger page" href="http://www.onextrapixel.com/page/10/">10</a><a class="larger page" href="http://www.onextrapixel.com/page/20/">20</a><span class='extend'>...</span><a class="nextpostslink" rel="next" href="http://www.onextrapixel.com/page/2/">Next »</a>
</div>  
			
					</div>	

<div class="sidebar">
	<div class="sidebar-edm">
		<h2>Get Our Latest Updates</h2>
		<p>Join the community and stay updated with useful design and development resources and materials for FREE.</p>
		
		<style>
#mlb2-506299,
#mlb2-506299 *,
#mlb2-506299 a:hover,
#mlb2-506299 a:visited,
#mlb2-506299 a:active{
    overflow:visible;
    position:static;
    background:none;
    border:none;
    bottom:auto;
    clear:none;
    cursor:default;
    float:none;
    font-size:medium;
    font-style:normal;
    font-weight:normal;
    letter-spacing:normal;
    line-height:normal;
    text-align:left;
    text-decoration:none;
    text-indent:0;
    text-transform:none;
    visibility:visible;
    white-space:normal;

    max-height:none;
    max-width:none;
    left:auto;
    min-height:0;
    min-width:0;
    right:auto;
    top:auto;
    width:auto;
    z-index:auto;
}


    #mlb2-506299 .subscribe-form {
        border: 0px solid #BDC3C7!important;
    }

    #mlb2-506299 .subscribe-form .form-section {
    
        /*float: left;*/
        /*width: 100%;*/
        margin-bottom: 20px;
    
    }

    #mlb2-506299 .subscribe-form .form-section h4 {
    
        margin: 0px 0px 15px 0px;
        color: #27AE60!important;
        font-family: Arial!important;
        font-size: 20px!important;
        line-height: 100%;
    
    }

    #mlb2-506299 .subscribe-form .form-section p {
        background: #FCF8E3;
        padding: 15px;
        line-height: 150%;
        margin: 0px 0px 0px 0px;
        color: #8A6D3B!important;
        font-family: Arial!important;
        font-size: 13px!important;
    
    }

    #mlb2-506299 .subscribe-form .form-section .form-group {
    
        margin-bottom: 15px;
    
    }

    #mlb2-506299 .subscribe-form .form-section .form-group label {
    
        float: left;
        margin-bottom: 10px;
        width: 100%;
        line-height: 100%;
        font-weight: bold;
        color: #000000!important;
        font-family: Arial!important;
        font-size: 13px!important;
    
    }

    #mlb2-506299 .subscribe-form .form-section .checkbox {
        

        width: 100%;
        margin: 0px 0px 10px 0px;
        

    }

    #mlb2-506299 .subscribe-form .form-section .checkbox label {

    

        color: #000000!important;
        font-family: Arial!important;
        font-size: 13px!important;
    

    }

    #mlb2-506299 .subscribe-form .form-section .checkbox input {

    
        margin: 0px 5px 0px 0px;
    

    }


    #mlb2-506299.ml-subscribe-form .form-group .form-control {
        cursor: text;
        width: 100%;
        font-size: 13px;
        padding: 10px 10px;
        height: auto;
        font-family: Arial;
        border-radius: 5px;
        border: 2px solid #BDC3C7!important;
        color: #000000!important;
        background-color: #FFFFFF!important;
    	-webkit-box-sizing: border-box;
    	-moz-box-sizing: border-box;
    	box-sizing: border-box;
        clear: left;

    

    }

    #mlb2-506299.ml-subscribe-form button {

    

        border: none;
        cursor: pointer;
        width: 100%;
        border-radius: 5px;
        height: 40px;
        background-color: #2ECC71!important;
        color: #FFFFFF!important;
        font-family: Arial!important;
        font-size: 16!important;
        text-align: center;

    

    }

    #mlb2-506299.ml-subscribe-form button.gradient-on {

    

            background: -webkit-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);
            background: -o-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);
            background: -moz-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);
            background: linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);

    

    }

    #mlb2-506299.ml-subscribe-form button.gradient-on:hover {

    

            background: -webkit-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);
            background: -o-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);
            background: -moz-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);
            background: linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);

    

    }

    #mlb2-506299.ml-subscribe-form .form-section.ml-error label {

    

        color: red!important;

    

    }

    #mlb2-506299.ml-subscribe-form .form-group.ml-error label {

    

        color: red!important;

    

    }

    #mlb2-506299.ml-subscribe-form .form-group.ml-error .form-control  {

    

        border-color: red!important;

    

    }

</style>

<div id="mlb2-506299" class="ml-subscribe-form">
<div class="ml-vertical-align-center">

    <div class="subscribe-form ml-block-success" style="display:none">
        <div class="form-section">
            <p>Thank you! You have successfully subscribed to our newsletter.</p>
        </div>
    </div>
    <form class="ml-block-form" action="https://app.mailerlite.com/webforms/submit/r0u9m7" data-code="r0u9m7" method="POST" target="_blank">

        <div class="subscribe-form">
            <div class="form-section">
                <div class="form-group ml-field-email ml-validate-required ml-validate-email">
                    <input type="text" name="fields[email]" class="form-control" placeholder="Email*" value="">
                </div>
            </div>
            <input type="hidden" name="ml-submit" value="1" />
            <button type="submit" class="gradient-on">Subscribe</button>
        </div>
    </form>
</div>
</div>
<script type="text/javascript" src="//mailerlite.com/js/w/webforms.js?v2"></script>	</div>
	
	<div class="sidebar-ads__header">
		<div class="sidebar-ads__title">Advertisement</div>
		
		<a class="sidebar-ads__advertise" href="/advertise/">Advertise with us</a>
	</div>
	
	<div class="sidebar__ads-block sidebar__ads-200">
		<!-- BuySellAds Zone Code -->
		<div id="bsap_1287848" class="bsarocks bsap_bcc688b2059ea2d9f46c4ca12eea9ac0"></div>
		<!-- End BuySellAds Zone Code -->
	</div>

	<div class="sidebar__ads-block sidebar__ads">
		<div class="adsbox">
			<a href="http://www.wix.com/domain/names" title="Domain Registration" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/wix-banner.jpg" alt="Domain Registration" />
				Domain Registration
			</a>
		</div>

		<div class="adsbox own-even">
			<a href="http://www.leawo.org/blu-ray-ripper/" title="blu-ray ripper, rip blu-ray to 100+ videos" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/leawo-bluray-ripper-onextrapixel.gif" alt="blu-ray ripper, rip blu-ray to 100+ videos" />
			</a>
			<a href="http://www.leawo.org/blu-ray-ripper/" title="Blu-ray Ripper">Blu-ray Ripper</a>
		</div>

		<div class="adsbox">
			<a href="http://www.dvdfab.cn/dvd-copy.htm?ad=onextrapixel" title="Copy DVD!" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/dvd.gif" alt="Copy DVD!" />
			</a>
			<a href="http://www.dvdfab.cn/dvd-copy.htm" title="Copy DVD">Copy DVD</a>
		</div>

		<div class="adsbox own-even">
			<a href="http://goo.gl/Eoa4mC" title="MaxCDN" rel="nofollow" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/maxcdn.jpg" alt="MaxCDN" />
				MaxCDN
			</a>
		</div>

		<div class="adsbox">
			<a href="http://www.websitebuilderexpert.com/" title="Best Website Builder" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/best-website-builder.jpg" alt="Best Website Builder" />
				&nbsp;
			</a>
		</div>

		<div class="adsbox own-even">
			<a href="http://store.templatemonster.com?aff=oxp" title="Template Monster" rel="nofollow" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/templatemonster.jpg" alt="Template Monster" />
			</a>
		</div>

		<div class="adsbox">
			<a href="http://uxstrategiessummit.com/?ref=onextrapixel" title="UX Strategies Summit" target="_blank">
				<img src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/images/UX-200X125.gif" alt="UX Strategies Summit" />
				UX Strategies Summit
			</a>
		</div>
	</div>

	<div class="sidebar__ads-block sidebar__ads-125">
		<!-- BuySellAds.com Zone Code -->
		<div id="bsap_1242583" class="bsarocks bsap_bcc688b2059ea2d9f46c4ca12eea9ac0"></div>
		<!-- END BuySellAds.com Zone Code -->
	</div>

	<div id="sidebar__sticky-ads">
		<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
		<!-- OXPSidebarCenter336x280 -->
		<ins class="adsbygoogle"
		     style="display:inline-block;width:336px;height:280px"
		     data-ad-client="ca-pub-5606861741839360"
		     data-ad-slot="7866829884"></ins>
		<script>
		(adsbygoogle = window.adsbygoogle || []).push({});
		</script>
	</div>
</div>	</div>
</div>

<div id="CoverPop-cover" class="splash">
	<div class="CoverPop-content splash-center">
		<a class="CoverPop-close" href="#">Close</a>
		<div class="CoverPop-img" style="padding: 20px;">
			<h4>Newsletter</h4>
			<p>Signup for design news and special offers on Onextrapixel!</p>
			
			<style>
#mlb2-506299,
#mlb2-506299 *,
#mlb2-506299 a:hover,
#mlb2-506299 a:visited,
#mlb2-506299 a:active{
    overflow:visible;
    position:static;
    background:none;
    border:none;
    bottom:auto;
    clear:none;
    cursor:default;
    float:none;
    font-size:medium;
    font-style:normal;
    font-weight:normal;
    letter-spacing:normal;
    line-height:normal;
    text-align:left;
    text-decoration:none;
    text-indent:0;
    text-transform:none;
    visibility:visible;
    white-space:normal;

    max-height:none;
    max-width:none;
    left:auto;
    min-height:0;
    min-width:0;
    right:auto;
    top:auto;
    width:auto;
    z-index:auto;
}


    #mlb2-506299 .subscribe-form {
        border: 0px solid #BDC3C7!important;
    }

    #mlb2-506299 .subscribe-form .form-section {
    
        /*float: left;*/
        /*width: 100%;*/
        margin-bottom: 20px;
    
    }

    #mlb2-506299 .subscribe-form .form-section h4 {
    
        margin: 0px 0px 15px 0px;
        color: #27AE60!important;
        font-family: Arial!important;
        font-size: 20px!important;
        line-height: 100%;
    
    }

    #mlb2-506299 .subscribe-form .form-section p {
        background: #FCF8E3;
        padding: 15px;
        line-height: 150%;
        margin: 0px 0px 0px 0px;
        color: #8A6D3B!important;
        font-family: Arial!important;
        font-size: 13px!important;
    
    }

    #mlb2-506299 .subscribe-form .form-section .form-group {
    
        margin-bottom: 15px;
    
    }

    #mlb2-506299 .subscribe-form .form-section .form-group label {
    
        float: left;
        margin-bottom: 10px;
        width: 100%;
        line-height: 100%;
        font-weight: bold;
        color: #000000!important;
        font-family: Arial!important;
        font-size: 13px!important;
    
    }

    #mlb2-506299 .subscribe-form .form-section .checkbox {
        

        width: 100%;
        margin: 0px 0px 10px 0px;
        

    }

    #mlb2-506299 .subscribe-form .form-section .checkbox label {

    

        color: #000000!important;
        font-family: Arial!important;
        font-size: 13px!important;
    

    }

    #mlb2-506299 .subscribe-form .form-section .checkbox input {

    
        margin: 0px 5px 0px 0px;
    

    }


    #mlb2-506299.ml-subscribe-form .form-group .form-control {
        cursor: text;
        width: 100%;
        font-size: 13px;
        padding: 10px 10px;
        height: auto;
        font-family: Arial;
        border-radius: 5px;
        border: 2px solid #BDC3C7!important;
        color: #000000!important;
        background-color: #FFFFFF!important;
    	-webkit-box-sizing: border-box;
    	-moz-box-sizing: border-box;
    	box-sizing: border-box;
        clear: left;

    

    }

    #mlb2-506299.ml-subscribe-form button {

    

        border: none;
        cursor: pointer;
        width: 100%;
        border-radius: 5px;
        height: 40px;
        background-color: #2ECC71!important;
        color: #FFFFFF!important;
        font-family: Arial!important;
        font-size: 16!important;
        text-align: center;

    

    }

    #mlb2-506299.ml-subscribe-form button.gradient-on {

    

            background: -webkit-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);
            background: -o-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);
            background: -moz-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);
            background: linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.2) 100%);

    

    }

    #mlb2-506299.ml-subscribe-form button.gradient-on:hover {

    

            background: -webkit-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);
            background: -o-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);
            background: -moz-linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);
            background: linear-gradient(top, rgba(0,0,0,0) 0%, rgba(0,0,0,0.3) 100%);

    

    }

    #mlb2-506299.ml-subscribe-form .form-section.ml-error label {

    

        color: red!important;

    

    }

    #mlb2-506299.ml-subscribe-form .form-group.ml-error label {

    

        color: red!important;

    

    }

    #mlb2-506299.ml-subscribe-form .form-group.ml-error .form-control  {

    

        border-color: red!important;

    

    }

</style>

<div id="mlb2-506299" class="ml-subscribe-form">
<div class="ml-vertical-align-center">

    <div class="subscribe-form ml-block-success" style="display:none">
        <div class="form-section">
            <p>Thank you! You have successfully subscribed to our newsletter.</p>
        </div>
    </div>
    <form class="ml-block-form" action="https://app.mailerlite.com/webforms/submit/r0u9m7" data-code="r0u9m7" method="POST" target="_blank">

        <div class="subscribe-form">
            <div class="form-section">
                <div class="form-group ml-field-email ml-validate-required ml-validate-email">
                    <input type="text" name="fields[email]" class="form-control" placeholder="Email*" value="">
                </div>
            </div>
            <input type="hidden" name="ml-submit" value="1" />
            <button type="submit" class="gradient-on">Subscribe</button>
        </div>
    </form>
</div>
</div>
<script type="text/javascript" src="//mailerlite.com/js/w/webforms.js?v2"></script>		</div>
	</div>
</div>

<div id="footer">
	<div class="container">
		<div class="footer__copy">
			&copy; 2015 Onextrapixel. Handcrafted in Singapore. All Rights Reserved. <br />
			<span>Onextrapixel is, and always has been an independent body. We strive to share the best web resources with the community but we are not affiliated to any other agency or company. For any enquires, please <a href="/contact/">contact us</a>.</span>
		</div>

		<div class="footer__link">
			<ul>
				<li><a href="/about/">About</a></li>
				<li><a href="/contact/">Contact</a></li>
				<li><a href="/write-for-us/">Write</a></li>
				<li><a href="/advertise/">Advertise</a></li>
				<li><a href="/legal/">Legal</a></li>
				<li><a href="/terms-of-use/">Terms of Use</a></li>
			</ul>
		</div>
	</div>
</div>

<script type="text/javascript" src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/js/dropdown.min.js" ></script>
<script type="text/javascript" src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/js/CoverPop.min.js?ver=0.01"></script>
<script type="text/javascript" src="http://cdn.onextrapixel.com/wp-content/themes/onextrapixelv10/js/setting.min.js?ver0.33" ></script>
<script src="//s3.buysellads.com/ac/sitecart.js" id="bsasitecart" data-site="15363" data-inventory-id="bsap_inventory"></script> 

<script type="text/javascript">
	CoverPop.start({
		coverId: 'CoverPop-cover',
		cookieName: 'oxp-edm-pop-2015B',
		expires: 1,
		hideAfter: 20000,
		delay: 7000
	});
</script>


	<script type="text/javascript">jQuery(document).ready(function(){jQuery(".freebie-sub-form").submit(function(){var a=jQuery(this),e=a.serialize(),c=a.children("div.replaceArea"),d=c.children("div.replaceArea-error");jQuery(".form-download-button");d.html("");jQuery('input[type="submit"]',a).val("Sending...");jQuery.ajax({type:"POST",url:"http://www.onextrapixel.com/wp-content/plugins/wp-freebie-sub/inc/submit.php",data:e,success:function(b){"true"==b.error?(d.html(b.message),jQuery('input[type="submit"]',a).val("Download")):c.html(b.message)}});return!1});});</script>
	

</body>




</html>