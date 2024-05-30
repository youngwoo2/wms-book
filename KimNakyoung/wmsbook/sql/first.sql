# 로컬 mysql에 계정(root) book/book
create user 'book'@'%' identified by 'book';
# 스키마 wms_book_db를 생성
create database wms_book_db;
# 만든 계정에 만든스키마 모든 권한 주기
grant all privileges on wms_book_db.* to 'book'@'%';