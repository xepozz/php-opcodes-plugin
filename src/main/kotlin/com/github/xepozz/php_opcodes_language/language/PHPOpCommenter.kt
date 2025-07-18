package com.github.xepozz.php_opcodes_language.language

import com.intellij.lang.Commenter

class PHPOpCommenter : Commenter {
    override fun getLineCommentPrefix(): String = ";"

    override fun getBlockCommentPrefix(): String? = null

    override fun getBlockCommentSuffix(): String? = null

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null
}