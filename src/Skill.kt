interface Skill<in T, out R> {

    fun getSkill ()

    fun setSkill(Skill: T): R
}