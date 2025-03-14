package com.github.nvelychenko.drupalextend.reference.referenceType

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.search.GlobalSearchScope

class FieldReference(element: PsiElement, val entityTypeId: String, val fieldName: String) :
    PsiPolyVariantReferenceBase<PsiElement>(element) {

    private val project = element.project
    private val scope = GlobalSearchScope.allScope(project)

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        return ResolveResult.EMPTY_ARRAY
    }
}
