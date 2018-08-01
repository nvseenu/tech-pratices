module GitCommitTree
  module Core
    class Branch
      attr_reader :name, :date, :commit_id

      def initialize(name:, date:, commit_id:)
        @name = name
        @date = date
        @commit_id = commit_id        
      end      

      def to_s
        "Branch { name: #{@name}, date: #{@date}, commit_id: #{@commit_id}}"                   
      end      
    end
  end
end
