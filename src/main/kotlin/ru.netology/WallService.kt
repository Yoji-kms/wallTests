package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun clear() {
        posts = emptyArray()
    }

    fun add(post: Post): Post {
        val newPost = post.copy(id = posts.lastIndex + 1)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, updatingPost) in posts.withIndex()) {
            if (index == post.id) {
                posts[index] = post.copy(
                    ownerId = updatingPost.ownerId,
                    date = updatingPost.date
                )
                return true
            }
        }
        return false
    }
}