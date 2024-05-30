DROP TABLE IF EXISTS tbl_order_item CASCADE ;
DROP TABLE IF EXISTS tbl_order CASCADE ;
DROP TABLE IF EXISTS tbl_user CASCADE ;
DROP TABLE IF EXISTS tbl_inventory CASCADE ;
DROP TABLE IF EXISTS tbl_book CASCADE ;



CREATE TABLE tbl_user (
    user_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '사용자 ID',
    username VARCHAR(50) UNIQUE NOT NULL COMMENT '사용자 이름',
    password VARCHAR(255) NOT NULL COMMENT '비밀번호',
    role ENUM('admin', 'manager', 'employee') NOT NULL COMMENT '사용자 역할',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성 일시'
) COMMENT '사용자 테이블';

CREATE TABLE tbl_book (
    book_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '도서 ID',
    title VARCHAR(255) NOT NULL COMMENT '도서 제목',
    author VARCHAR(255) NOT NULL COMMENT '저자',
    description TEXT COMMENT '설명',
    price DECIMAL(10, 2) NOT NULL COMMENT '가격',
    category VARCHAR(100) NOT NULL COMMENT '카테고리',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성 일시'
) COMMENT '도서 테이블';

CREATE TABLE tbl_inventory (
    inventory_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '재고 ID', 
    book_id INT NOT NULL COMMENT '도서 ID',
    quantity INT NOT NULL COMMENT '수량',
    location VARCHAR(255) COMMENT '위치',
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '마지막 업데이트 일시',
    FOREIGN KEY (book_id) REFERENCES tbl_book(book_id)
) COMMENT '재고 테이블';

CREATE TABLE tbl_order (
    order_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '주문 ID',
    user_id INT NOT NULL COMMENT '사용자 ID',
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '주문 날짜',
    status ENUM('pending', 'processing', 'shipped', 'completed') DEFAULT 'pending' COMMENT '주문 상태',
    FOREIGN KEY (user_id) REFERENCES tbl_user(user_id)
) COMMENT '주문 테이블';

CREATE TABLE tbl_order_item (
    order_item_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '주문 항목 ID',
    order_id INT NOT NULL COMMENT '주문 ID',
    book_id INT NOT NULL COMMENT '도서 ID',
    quantity INT NOT NULL COMMENT '수량',
    price DECIMAL(10, 2) NOT NULL COMMENT '가격',
    FOREIGN KEY (order_id) REFERENCES tbl_order(order_id),
    FOREIGN KEY (book_id) REFERENCES tbl_book(book_id)
) COMMENT '주문 항목 테이블';


-- tbl_user 테이블 샘플 데이터
INSERT INTO tbl_user (username, password, role) VALUES
('관리자', 'password123', 'admin'),
('도서관리자1', 'password123', 'manager'),
('직원1', 'password123', 'employee'),
('직원2', 'password123', 'employee'),
('직원3', 'password123', 'employee'),
('직원4', 'password123', 'employee'),
('직원5', 'password123', 'employee'),
('직원6', 'password123', 'employee'),
('직원7', 'password123', 'employee'),
('직원8', 'password123', 'employee'),
('직원9', 'password123', 'employee'),
('직원10', 'password123', 'employee'),
('직원11', 'password123', 'employee'),
('직원12', 'password123', 'employee'),
('직원13', 'password123', 'employee'),
('직원14', 'password123', 'employee'),
('직원15', 'password123', 'employee'),
('직원16', 'password123', 'employee'),
('직원17', 'password123', 'employee'),
('직원18', 'password123', 'employee'),
('직원19', 'password123', 'employee'),
('직원20', 'password123', 'employee'),
('직원21', 'password123', 'employee'),
('직원22', 'password123', 'employee'),
('직원23', 'password123', 'employee'),
('직원24', 'password123', 'employee'),
('직원25', 'password123', 'employee'),
('직원26', 'password123', 'employee'),
('직원27', 'password123', 'employee'),
('직원28', 'password123', 'employee');

-- tbl_book 테이블 샘플 데이터
INSERT INTO tbl_book (title, author, description, price, category) VALUES
('데이터베이스 관리', '홍길동', '데이터베이스에 관한 기본 이론', 25000, '컴퓨터'),
('자바 프로그래밍', '김철수', '자바 언어의 기초부터 고급까지', 30000, '컴퓨터'),
('알고리즘 문제해결 전략', '이영희', '다양한 알고리즘 문제를 해결하는 방법', 27000, '컴퓨터'),
('머신러닝 입문', '박민수', '머신러닝의 기본 개념과 실습', 32000, '인공지능'),
('딥러닝 실전', '최영희', '딥러닝 모델의 구현과 응용', 35000, '인공지능'),
('파이썬 완벽 가이드', '정수진', '파이썬 프로그래밍의 모든 것', 28000, '컴퓨터'),
('네트워크 해킹과 보안', '김영철', '네트워크 해킹 기법과 보안 방법', 26000, '컴퓨터'),
('리눅스 커맨드라인 완벽정리', '박지훈', '리눅스 명령어 정리와 활용', 29000, '컴퓨터'),
('운영체제의 이해', '조수미', '운영체제의 기본 원리와 작동 방식', 27000, '컴퓨터'),
('컴퓨터 구조와 원리', '이현우', '컴퓨터 구조의 기초와 동작 원리', 28000, '컴퓨터'),
('클라우드 컴퓨팅 개론', '정민수', '클라우드 컴퓨팅의 기본 개념과 서비스', 30000, '컴퓨터'),
('데이터 과학 개론', '홍민지', '데이터 과학의 이론과 실습', 32000, '데이터'),
('빅데이터 분석', '김성현', '빅데이터 분석 기법과 활용', 34000, '데이터'),
('통계학 입문', '최정민', '통계학의 기본 개념과 분석 방법', 25000, '데이터'),
('확률과 통계', '이유진', '확률 이론과 통계 방법론', 27000, '데이터'),
('수학의 정석', '박종민', '수학 기초부터 고급까지의 이론과 문제', 24000, '수학'),
('공업수학', '김민수', '공업수학의 기초와 응용', 26000, '수학'),
('선형대수학', '이준호', '선형대수의 이론과 실습', 28000, '수학'),
('미적분학', '정은혜', '미적분학의 기본 개념과 응용', 30000, '수학'),
('물리학의 기본', '홍석현', '물리학의 기초 이론과 응용', 32000, '과학'),
('화학의 원리', '김지수', '화학의 기본 개념과 실험', 31000, '과학'),
('생물학 입문', '이수경', '생물학의 기초 개념과 연구 방법', 29000, '과학'),
('지구과학 개론', '최영민', '지구과학의 이론과 현상', 27000, '과학'),
('환경과 생태', '정소영', '환경과 생태계의 이해', 26000, '과학'),
('우주론 입문', '박선영', '우주의 기원과 구조', 28000, '과학'),
('천문학의 기초', '김하늘', '천문학의 이론과 관측', 30000, '과학'),
('지리학 개론', '이도훈', '지리학의 이론과 실제', 31000, '과학'),
('고대사 연구', '정재훈', '고대사의 연구와 이해', 25000, '역사'),
('중세사 개론', '최수진', '중세사 연구와 분석', 27000, '역사'),
('근현대사', '박진수', '근현대사의 이해와 연구', 30000, '역사');

-- tbl_inventory 테이블 샘플 데이터
INSERT INTO tbl_inventory (book_id, quantity, location) VALUES
((SELECT book_id FROM tbl_book WHERE title='데이터베이스 관리'), 100, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='자바 프로그래밍'), 50, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='알고리즘 문제해결 전략'), 150, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='머신러닝 입문'), 200, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='딥러닝 실전'), 80, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='파이썬 완벽 가이드'), 60, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='네트워크 해킹과 보안'), 90, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='리눅스 커맨드라인 완벽정리'), 120, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='운영체제의 이해'), 130, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='컴퓨터 구조와 원리'), 70, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='클라우드 컴퓨팅 개론'), 110, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='데이터 과학 개론'), 140, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='빅데이터 분석'), 160, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='통계학 입문'), 180, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='확률과 통계'), 190, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='수학의 정석'), 170, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='공업수학'), 200, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='선형대수학'), 210, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='미적분학'), 220, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='물리학의 기본'), 230, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='화학의 원리'), 240, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='생물학 입문'), 250, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='지구과학 개론'), 260, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='환경과 생태'), 270, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='우주론 입문'), 280, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='천문학의 기초'), 290, '창고1'),
((SELECT book_id FROM tbl_book WHERE title='지리학 개론'), 300, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='고대사 연구'), 310, '창고2'),
((SELECT book_id FROM tbl_book WHERE title='중세사 개론'), 320, '창고3'),
((SELECT book_id FROM tbl_book WHERE title='근현대사'), 330, '창고3');

-- tbl_order 테이블 샘플 데이터
INSERT INTO tbl_order (user_id, order_date, status) VALUES
((SELECT user_id FROM tbl_user WHERE username='직원1'), '2023-01-01 10:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원2'), '2023-01-02 11:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원3'), '2023-01-03 12:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원4'), '2023-01-04 13:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='직원5'), '2023-01-05 14:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원6'), '2023-01-06 15:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원7'), '2023-01-07 16:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원8'), '2023-01-08 17:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='직원9'), '2023-01-09 18:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원10'), '2023-01-10 19:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원11'), '2023-01-11 20:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원12'), '2023-01-12 21:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='직원13'), '2023-01-13 22:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원14'), '2023-01-14 23:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원15'), '2023-01-15 10:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원16'), '2023-01-16 11:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='직원17'), '2023-01-17 12:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원18'), '2023-01-18 13:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원19'), '2023-01-19 14:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원20'), '2023-01-20 15:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='직원21'), '2023-01-21 16:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원22'), '2023-01-22 17:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원23'), '2023-01-23 18:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원24'), '2023-01-24 19:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='직원25'), '2023-01-25 20:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='직원26'), '2023-01-26 21:00:00', 'processing'),
((SELECT user_id FROM tbl_user WHERE username='직원27'), '2023-01-27 22:00:00', 'shipped'),
((SELECT user_id FROM tbl_user WHERE username='직원28'), '2023-01-28 23:00:00', 'completed'),
((SELECT user_id FROM tbl_user WHERE username='도서관리자1'), '2023-01-29 10:00:00', 'pending'),
((SELECT user_id FROM tbl_user WHERE username='관리자'), '2023-01-30 11:00:00', 'processing');

-- tbl_order_item 테이블 샘플 데이터
INSERT INTO tbl_order_item (order_id, book_id, quantity, price) VALUES
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원1')), (SELECT book_id FROM tbl_book WHERE title='데이터베이스 관리'), 2, 25000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원2')), (SELECT book_id FROM tbl_book WHERE title='자바 프로그래밍'), 1, 30000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원3')), (SELECT book_id FROM tbl_book WHERE title='알고리즘 문제해결 전략'), 3, 27000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원4')), (SELECT book_id FROM tbl_book WHERE title='머신러닝 입문'), 4, 32000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원5')), (SELECT book_id FROM tbl_book WHERE title='딥러닝 실전'), 2, 35000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원6')), (SELECT book_id FROM tbl_book WHERE title='파이썬 완벽 가이드'), 5, 28000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원7')), (SELECT book_id FROM tbl_book WHERE title='네트워크 해킹과 보안'), 1, 26000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원8')), (SELECT book_id FROM tbl_book WHERE title='리눅스 커맨드라인 완벽정리'), 3, 29000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원9')), (SELECT book_id FROM tbl_book WHERE title='운영체제의 이해'), 2, 27000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원10')), (SELECT book_id FROM tbl_book WHERE title='컴퓨터 구조와 원리'), 4, 28000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원11')), (SELECT book_id FROM tbl_book WHERE title='클라우드 컴퓨팅 개론'), 3, 30000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원12')), (SELECT book_id FROM tbl_book WHERE title='데이터 과학 개론'), 2, 32000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원13')), (SELECT book_id FROM tbl_book WHERE title='빅데이터 분석'), 1, 34000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원14')), (SELECT book_id FROM tbl_book WHERE title='통계학 입문'), 5, 25000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원15')), (SELECT book_id FROM tbl_book WHERE title='확률과 통계'), 2, 27000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원16')), (SELECT book_id FROM tbl_book WHERE title='수학의 정석'), 3, 24000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원17')), (SELECT book_id FROM tbl_book WHERE title='공업수학'), 4, 26000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원18')), (SELECT book_id FROM tbl_book WHERE title='선형대수학'), 1, 28000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원19')), (SELECT book_id FROM tbl_book WHERE title='미적분학'), 3, 30000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원20')), (SELECT book_id FROM tbl_book WHERE title='물리학의 기본'), 2, 32000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원21')), (SELECT book_id FROM tbl_book WHERE title='화학의 원리'), 4, 31000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원22')), (SELECT book_id FROM tbl_book WHERE title='생물학 입문'), 3, 29000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원23')), (SELECT book_id FROM tbl_book WHERE title='지구과학 개론'), 5, 27000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원24')), (SELECT book_id FROM tbl_book WHERE title='환경과 생태'), 2, 26000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원25')), (SELECT book_id FROM tbl_book WHERE title='우주론 입문'), 3, 28000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원26')), (SELECT book_id FROM tbl_book WHERE title='천문학의 기초'), 4, 30000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원27')), (SELECT book_id FROM tbl_book WHERE title='지리학 개론'), 1, 31000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='직원28')), (SELECT book_id FROM tbl_book WHERE title='고대사 연구'), 3, 25000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='도서관리자1')), (SELECT book_id FROM tbl_book WHERE title='중세사 개론'), 2, 27000),
((SELECT order_id FROM tbl_order WHERE user_id=(SELECT user_id FROM tbl_user WHERE username='관리자')), (SELECT book_id FROM tbl_book WHERE title='근현대사'), 4, 30000);
