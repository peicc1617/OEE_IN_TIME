/*开始生产*/
function produce() {
    sendAjax("produce");
}
/*计划停机*/
//开始
function Schedule_Stop_Time_Start() {
    sendAjax("Schedule_Stop_Time_Start");
}
// 结束
function Schedule_Stop_Time_End() {
    sendAjax("Schedule_Stop_Time_End");
}
/*故障停机*/
//开始
function Equipment_Failure_Start() {
    sendAjax("Equipment_Failure_Start");
}
//结束
function Equipment_Failure_End() {
    sendAjax("Equipment_Failure_End");
}
/*更换产品*/
//开始
function Changeover_Time_Start() {
    sendAjax("Changeover_Time_Start");
}
//结束
function Changeover_Time_End() {
    sendAjax("Changeover_Time_End");
}
/*更换工具（设置调整）*/
//开始
function Setup_Adjust_Time_Start() {
    sendAjax("Setup_Adjust_Time_Start");
}
//结束
function Setup_Adjust_Time_End() {
    sendAjax("Setup_Adjust_Time_End");
}
/*空转*/
//开始
function Idling_Time_Start() {
    sendAjax("Idling_Time_Start");
}
//结束
function Idling_Time_End() {
    sendAjax("Idling_Time_End");
}
/*间歇停机*/
//开始
function Small_Stop_Time_Start() {
    sendAjax("Small_Stop_Time_Start");
}
//结束
function Small_Stop_Time_End() {
    sendAjax("Small_Stop_Time_End");
}
/*次品检测*/
function Set_Reject() {
    alert("功能开发中");
}
/*速度调整*/
function Set_Speed() {
    alert("功能开发中");
}
/*发送ajax请求*/
