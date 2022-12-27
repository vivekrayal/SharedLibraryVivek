def call(jobname,buildnumber,buildurl)
{
     slackSend channel: 'slack_notifications_snatak', message: "pipeline status for  ${jobname} Build No- ${buildnumber} url :${buildurl}" 
  }
