$(function () {
    $(".img1").find('img').click(function () {
        $(this).parent().find('input').click();
    });
    $("input[type='file']").change(function () {
        var a = $(this);
        if (this.files && this.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $(a).parent().find('img').attr('src', e.target.result);
            }
            reader.readAsDataURL(this.files[0]);
        }
    });

});

