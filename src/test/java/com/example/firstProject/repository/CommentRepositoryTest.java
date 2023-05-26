package com.example.firstProject.repository;

import com.example.firstProject.entity.Article;
import com.example.firstProject.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest // JPA와 연동한 테스트!
class CommentRepositoryTest {
    @Autowired CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        /* Case 1: 4번 게시글의 모든 댓글 조회 */
        {
            //입력 데이터 준비
            Long articleId = 4L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(4L, "당신의 인생 영화는?", "댓글ㄱ");
            Comment a = new Comment(1L, article, "Park", "굳 윌 현팅");
            Comment b = new Comment(2L, article, "Kim", "아이 엠 샘");
            Comment c = new Comment(3L, article, "Choi", "쇼생크의 탈출");
            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
        }

        /* Case 2: 4번 게시글의 모든 댓글 조회 */
        {
            //입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(1L, "당신의 인생 영화는?", "댓글ㄱ");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없야");
        }

        /* Case 3: 4번 게시글의 모든 댓글 조회 */
        {}
        /* Case 4: 4번 게시글의 모든 댓글 조회 */
        {}
        /* Case 5: 4번 게시글의 모든 댓글 조회 */
        {}
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        /* Case 1: "Park"의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비
            String nickname = "Park";

            // 실제 수행
            List<Comment> comments = commentRepository.findByNickname(nickname);

            // 예상하기
            Comment a = new Comment(2L, new Article(4L, "당신의 인생 영화는?", "댓글ㄱ"), nickname, "굳 윌 헌팅");
            Comment b = new Comment(4L, new Article(5L, "당신의 소울 푸드는?", "댓글ㄱㄱ"), nickname, "아이 엠 샘");
            Comment c = new Comment(7L, new Article(6L, "당신의 취미는?", "댓글ㄱㄱㄱ"), nickname, "쇼생크의 탈출");
            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "Park의 모든 댓글을 출력!");
        }

        /* Case 2: "Kim"의 모든 댓글 조회 */
        {}

        /* Case 3: null 의 모든 댓글 조회 */
        {}

        /* Case 4: ""의 모든 댓글 조회 */
        {}

        /* Case 5: "i"의 모든 댓글 조회 */
        {}
    }
}