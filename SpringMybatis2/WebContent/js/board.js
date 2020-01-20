function check_ok() {
	
  if(document.form.b_name.value.length==0) {
    alert("입력하지 않은 곳이 있습니다");
    form.b_name.focus();
    return false;
  }
  if(document.form.b_title.value.length==0) {
    alert("입력하지 않은 곳이 있습니다");
    form.b_title.focus();
    return false;
  }
  if(document.form.b_content.value.length==0) {
    alert("입력하지 않은 곳이 있습니다");
    form.b_content.focus();
    return false;
  }
  if(document.form.b_pwd.value.length==0) {
    alert("입력하지 않은 곳이 있습니다");
    form.b_pwd.focus();
    return false;
  }  
 
  
  document.form.submit();
}

//������ Ŭ�������� ȣ��Ǵ� �Լ�
function delete_ok(){
  if(document.form.b_pwd.value.length==0) {
    alert("��й�ȣ�� �Է¼���.");
    form.b_pwd.focus();
    return false;
  }  
  document.form.submit();
}


// �˻� �κп� �ش��ϴ� �Լ�

function check(){
     if (document.search.keyWord.value == ""){
		 alert("�˻�� �Է��ϼ���.");
		 document.search.keyWord.focus();
		 return;
	    }
	 document.search.submit();
 }


//���б�� �̵��Ҷ� ȣ��Ǵ� �Լ�
function read_Action(no){
	document.read.b_id.value=no;
	document.read.submit();//����
	
}

//�۸��/����/����/�亯 �̵��Ҷ� ȣ��Ǵ� �Լ�
function move_Action( url ){
	document.move.action = url;//�̵��� ����������
	document.move.submit();//����
	
}

//�����Ϸ� Ŭ��������
function update_Action(){
	 if(document.update.b_pwd.value ==""){
		 alert("��й�ȣ�� �Է����ּ���.");
		 document.update.b_pwd.focus();
		 return;
	 }
	 
	 document.update.action="update.do";
	 document.update.submit();
	
}



