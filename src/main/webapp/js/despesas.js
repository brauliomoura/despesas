/**
 * Baseado no exemplo de javascript de modal do Bootstrap
 * acesse: http://getbootstrap.com/javascript/#modals-related-target 
 */
$('#confirmaRemocaoModal').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigo = button.data('whatever');
	
	var modal = $(this);
	var form = modal.find('form');
	var action = form.attr('action');

	action = '/despesa/';
	form.attr('action', getContextPath() + action + codigo);
	
	modal.find('.modal-body span').html('Tem certeza que deseja excluir a despesa <strong>' + codigo + '</strong>?');
});

$(function() {
	$('.javascript-moeda').maskMoney({decimal: ',', thousands: '.', allowZero: true})
});

function getContextPath() {
	return window.location.pathname.substring(0, windows.location.pathname.indexOf("/",2));
}