INSERT INTO article(id, title, content) VALUES (1, 'A', '1');
INSERT INTO article(id, title, content) VALUES (2, 'B', '2');
INSERT INTO article(id, title, content) VALUES (3, 'C', '3');

-- article 더미 데이터
INSERT INTO article(id, title, content) VALUES (4, '당신의 인생 영화는?', '댓글ㄱ');
INSERT INTO article(id, title, content) VALUES (5, '당신의 소울 푸드는?', '댓글ㄱㄱ');
INSERT INTO article(id, title, content) VALUES (6, '당신의 취미는?', '댓글ㄱㄱㄱ');

-- comment 더미 데이터
---- 4번 게시글의 댓글들
INSERT INTO comment(article_id, nickname, body) VALUES (4, 'Park', '굳 윌 헌팅');
INSERT INTO comment(article_id, nickname, body) VALUES (4, 'Kim', '아이 엠 샘');
INSERT INTO comment(article_id, nickname, body) VALUES (4, 'Choi', '쇼생크의 탈출');

---- 5번 게시글의 댓글들
INSERT INTO comment(article_id, nickname, body) VALUES (5, 'Park', '치킨');
INSERT INTO comment(article_id, nickname, body) VALUES (5, 'Kim', '샤브샤브');
INSERT INTO comment(article_id, nickname, body) VALUES (5, 'Choi', '초밥');

---- 6번 게시글의 댓글들
INSERT INTO comment(article_id, nickname, body) VALUES (6, 'Park', '조깅');
INSERT INTO comment(article_id, nickname, body) VALUES (6, 'Kim', '유튜브');
INSERT INTO comment(article_id, nickname, body) VALUES (6, 'Choi', '독서');