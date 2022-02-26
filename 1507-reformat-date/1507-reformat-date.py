class Solution:
    def reformatDate(self, date: str) -> str:
        month_dict = {"Jan":"01", "Feb":"02", "Mar":"03", "Apr":"04", "May":"05", "Jun":"06", "Jul":"07", "Aug":"08", "Sep":"09", "Oct":"10", "Nov":"11", "Dec":"12"}
        
        split_date = date.split(" ")
        
        day = split_date[0][:-2]
        
        if len(day) == 1:
            day = "0" + day
        
        res = "{}-{}-{}".format(split_date[2], month_dict[split_date[1]], day)
        
        return res