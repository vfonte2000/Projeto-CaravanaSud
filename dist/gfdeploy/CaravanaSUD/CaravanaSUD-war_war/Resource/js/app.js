$(document).ready(function() {
	
	$('.js-alternar').bind('click', function() {
		$('.js-barralateral').toggleClass('alternando');
		$('.js-conteudo').toggleClass('alternando');
	});
});