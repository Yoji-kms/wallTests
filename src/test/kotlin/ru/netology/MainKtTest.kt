package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {
    @Test
    fun main_add() {
        val wall = WallService
        val post = Post()

        wall.add(post)
        wall.add(post.copy(date = 1))
        val lastPost = wall.add(post.copy(date = 2))
        wall.clear()

        assertNotEquals(0, lastPost.id)
    }

    @Test
    fun main_update_existing() {
        val wall = WallService
        val post = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "text",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comments(
                count = 0,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false
            ),
            copyright = "copyright",
            likes = Likes(
                count = 0,
                userLikes = false,
                canLike = false,
                canPublish = false
            ),
            reposts = Reposts(
                count = 0,
                userReposted = false
            ),
            views = Views(count = 0),
            postType = "type",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 0
        )

        wall.add(post)
        wall.add(post.copy(date = 1))
        wall.add(post.copy(date = 2))

        val updated = wall.update(post.copy(id = 1, text = "new text"))
        wall.clear()

        assertTrue(updated)
    }

    @Test
    fun main_update_notExisting() {
        val wall = WallService
        val post = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "text",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comments(
                count = 0,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false
            ),
            copyright = "copyright",
            likes = Likes(
                count = 0,
                userLikes = false,
                canLike = false,
                canPublish = false
            ),
            reposts = Reposts(
                count = 0,
                userReposted = false
            ),
            views = Views(count = 0),
            postType = "type",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 0
        )

        wall.add(post)
        wall.add(post.copy(date = 1))
        wall.add(post.copy(date = 2))

        val updated = wall.update(post.copy(id = 3, text = "new text"))
        wall.clear()

        assertFalse(updated)
    }
}