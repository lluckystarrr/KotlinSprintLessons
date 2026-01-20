package org.example.lesson_11

class Member(
    val avatar: String,
    val memberNickname: String,
    var talkingStatus: String = listOf("разговаривает", "микрофон выключен", "пользователь заглушен").random()
)

class Room(
    val roomCover: String,
    val roomName: String,
    val members: MutableList<Member> = mutableListOf()

) {
    fun addMember(newMember: Member) {
        members.add(newMember)
    }

    fun refreshStatus(memberNickname: String, talkingStatus: String) {
        for (member in members) {
            if (member.memberNickname == memberNickname) {
                member.talkingStatus = talkingStatus
                return
            }
        }
    }
}

fun main() {

    val room1 = Room(
        roomCover = "картинка",
        roomName = "название комнаты",
    )

    val member1 = Member(
        avatar = "аватарка1",
        memberNickname = "никнэйм",
        talkingStatus = "разговаривает"
    )

    val member2 = Member(
        avatar = "аватарка2",
        memberNickname = "никнэйм2",
        talkingStatus = "микрофон выключен"
    )

    room1.addMember(member1)
    room1.addMember(member2)
    room1.refreshStatus("никнэйм", "пользователь заглушен")

}
